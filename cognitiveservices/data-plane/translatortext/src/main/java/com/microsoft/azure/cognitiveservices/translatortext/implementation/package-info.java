// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

/**
 * This package contains the implementation classes for TranslatorTextClient.
 * # Introduction
 The Microsoft Translator Text API provides a JSON-based Web API. It provides:
   * Translation between any supported languages to any other supported language.
   * Translation to multiple languages in one request.
   * Transliteration to convert text from one script to another script of the same language.
   * Language detection, translation, and transliteration in one request.
   * Dictionary to lookup alternative translations of a term, to find back-translations and examples showing terms used in context.
   * Rich language detection.
 # Base URLs
 The Translator Text API is available in the following clouds:
 | Description | Region    | Base URL                                |
 | -------     | --------  | -------                                 |
 | Azure       | Global    | api.cognitive.microsofttranslator.com   |
 | Azure       | Europe    | api-eur.cognitive.microsofttranslator.com |
 # Authentication
 Subscribe to the Translator Text API, part of Azure Cognitive Services, and use your subscription key from the Azure portal to authenticate. You can follow the steps in https://docs.microsoft.com/en-us/azure/cognitive-services/translator/translator-text-how-to-signup.
 The simplest way is to pass your Azure secret key to the Translator service using the http request header `Ocp-Apim-Subscription-Key`.
 If you prefer using a short-lived authentication, you may use your secret key to obtain an authorization token from the token service. In that case you pass the authorization token to the Translator service using the `Authorization` request header. To obtain an authorization token, make a `POST` request to the following URL:
 | Environment | Authentication service URL                                |
 | ----------  | ----------                                                |
 | Azure       | `https://api.cognitive.microsoft.com/sts/v1.0/issueToken` |
 Here are example requests to obtain a token with a lifetime of 10 minutes, given a secret key:
 ```python
 // Pass secret key using header
 curl --header 'Ocp-Apim-Subscription-Key: <your-key>' --data "" 'https://api.cognitive.microsoft.com/sts/v1.0/issueToken'
 // Pass secret key using query string parameter
 curl --data "" 'https://api.cognitive.microsoft.com/sts/v1.0/issueToken?Subscription-Key=<your-key>'
 ```
 A successful request returns the encoded access token as plain text in the response body. The valid token is passed to the Translator service as a bearer token in the Authorization.
 ```
 Authorization: Bearer <Base64-access_token>
 ```
 An authentication token is valid for 10 minutes. The token should be re-used when making multiple calls to the Translator APIs. If you make requests to the Translator API over an extended period of time,  you  must request a new access token at regular intervals before the token expires, for instance every 9 minutes.
 To summarize, a client request to the Translator API will include one authorization header taken from the following table:
 | Headers       | Description  |
 | ----------    | ----------   |
 | Ocp-Apim-Subscription-key    | Use with Cognitive Services subscription if you are passing your secret key.                               The value is the Azure secret key for your subscription to Translator Text API.                         |
 | Authorization                | Use with Cognitive Services subscription if you are passing an authentication token. The value is the Bearer token: `Bearer <token>`.       |
 # Errors
 A standard error response is a JSON object with name/value pair named `error`. The value is also a JSON object with properties:
   * `code`: A server-defined error code.
   * `message`: A string giving a human-readable representation of the error.
 For example, a customer with a free trial subscription receives the following error once the free quota is exhausted:
 ```json
 {
   "error": {
   "code":403000,
   "message":"The subscription has exceeded its free quota."
   }
 }
 ```.
 */
package com.microsoft.azure.cognitiveservices.translatortext.implementation;
