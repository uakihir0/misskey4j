package misskey4j.internal.model;

import java.io.InputStream;

public class StreamFile {

    private InputStream stream;
    private String name;

    public StreamFile(InputStream stream, String name) {
        this.stream = stream;
        this.name = name;
    }

    // region
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }
    // region
}
