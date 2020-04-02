package misskey4j.internal.api;

import misskey4j.MisskeyAPI;
import misskey4j.api.FilesResource;
import misskey4j.api.request.files.FilesCreateRequest;
import misskey4j.api.response.files.FilesCreateResponse;
import misskey4j.entity.share.Response;
import misskey4j.internal.model.StreamFile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FilesResourceImpl extends AbstractResourceImpl implements FilesResource {

    public FilesResourceImpl(String uri, String i) {
        super(uri, i);
    }

    @Override
    public Response<FilesCreateResponse> create(
            FilesCreateRequest request) {

        Map<String, Object> params = new HashMap<>();
        addParam(params, "name", request.getName());
        addParam(params, "folderId", request.getFolderId());
        addParam(params, "isSensitive", request.getSensitive());
        addParam(params, "force", request.getForce());

        if (request.getFile() != null) {
            addParam(params, "file", request.getFile());
        }
        if (request.getStream() != null) {
            addParam(params, "file", new StreamFile(
                    request.getStream(),
                    request.getName()));
        }

        return post(FilesCreateResponse.class,
                MisskeyAPI.FilesCreate.code(), params);
    }
}
