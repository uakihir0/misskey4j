package misskey4j.api;

import misskey4j.api.request.GenerateAuthSessionRequest;
import misskey4j.api.request.GetMiAuthUriRequest;
import misskey4j.api.request.UserKeyAuthSessionRequest;
import misskey4j.api.response.GenerateAuthSessionResponse;
import misskey4j.api.response.UserKeyAuthSessionResponse;
import misskey4j.entity.share.Response;

/**
 * Auth APIs.
 */
public interface AuthResource {

    /**
     * アプリを認証するためのトークンを作成します。
     * https://misskey.io/api-doc#operation/auth/session/generate
     */
    Response<GenerateAuthSessionResponse> sessionGenerate(
            GenerateAuthSessionRequest request);

    /**
     * ユーザーのアクセストークンを発行します。
     * https://misskey.io/api-doc#operation/auth/session/userkey
     */
    Response<UserKeyAuthSessionResponse> sessionUserKey(
            UserKeyAuthSessionRequest request);

    /**
     * MiAuth の認証ページのアドレスを生成します。
     */
    Response<String> getMiAuthUri(GetMiAuthUriRequest request);
}
