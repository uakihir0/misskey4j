package misskey4j.api;

import misskey4j.api.request.files.FilesCreateRequest;
import misskey4j.api.response.files.FilesCreateResponse;
import misskey4j.entity.share.Response;

public interface FilesResource {

    /**
     * ドライブにファイルをアップロードします。
     * https://misskey.io/api-doc#operation/drive/files/create
     */
    Response<FilesCreateResponse> create(
            FilesCreateRequest request);

}
