/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The Audio Analyzer preset applies a pre-defined set of AI-based analysis
 * operations, including speech transcription. Currently, the preset supports
 * processing of content with a single audio track.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.AudioAnalyzerPreset")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.VideoAnalyzerPreset", value = VideoAnalyzerPreset.class)
})
public class AudioAnalyzerPreset extends Preset {
    /**
     * The language for the audio payload in the input using the BCP-47 format
     * of 'language tag-region' (e.g: 'en-US'). The list of supported languages
     * are, 'en-US', 'en-GB', 'es-ES', 'es-MX', 'fr-FR', 'it-IT', 'ja-JP',
     * 'pt-BR', 'zh-CN', 'de-DE', 'ar-EG', 'ru-RU', 'hi-IN'.
     */
    @JsonProperty(value = "audioLanguage")
    private String audioLanguage;

    /**
     * Get the language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US'). The list of supported languages are, 'en-US', 'en-GB', 'es-ES', 'es-MX', 'fr-FR', 'it-IT', 'ja-JP', 'pt-BR', 'zh-CN', 'de-DE', 'ar-EG', 'ru-RU', 'hi-IN'.
     *
     * @return the audioLanguage value
     */
    public String audioLanguage() {
        return this.audioLanguage;
    }

    /**
     * Set the language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US'). The list of supported languages are, 'en-US', 'en-GB', 'es-ES', 'es-MX', 'fr-FR', 'it-IT', 'ja-JP', 'pt-BR', 'zh-CN', 'de-DE', 'ar-EG', 'ru-RU', 'hi-IN'.
     *
     * @param audioLanguage the audioLanguage value to set
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
        return this;
    }

}