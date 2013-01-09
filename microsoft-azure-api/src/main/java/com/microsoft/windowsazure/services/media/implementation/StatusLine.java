/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.implementation;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import javax.activation.DataSource;

import com.sun.mail.util.LineInputStream;

public class StatusLine {
    private int status;
    private String reason;

    public static StatusLine create(DataSource dataSource) {
        InputStream inputStream;
        try {
            inputStream = dataSource.getInputStream();

            LineInputStream stream = new LineInputStream(inputStream);
            try {
                String line = stream.readLine();
                StringReader lineReader = new StringReader(line);

                expect(lineReader, "HTTP/1.1");
                expect(lineReader, " ");
                String statusString = extractInput(lineReader, ' ');
                String reason = extractInput(lineReader, -1);

                return new StatusLine().setStatus(Integer.parseInt(statusString)).setReason(reason);
            }
            finally {
                stream.close();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void expect(Reader reader, String string) {
        try {
            byte[] byteArray = string.getBytes();
            int ch;
            for (int i = 0; i < string.length(); i++) {
                ch = reader.read();
                if (ch != byteArray[i]) {
                    throw new RuntimeException(String.format("Expected '%s', found '%s' instead", string,
                            string.substring(0, i) + ch));
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String extractInput(Reader reader, int delimiter) {
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int ch = reader.read();
                if (ch == -1 || ch == delimiter)
                    break;

                sb.append((char) ch);
            }
            return sb.toString();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getStatus() {
        return status;
    }

    public StatusLine setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public StatusLine setReason(String reason) {
        this.reason = reason;
        return this;
    }
}