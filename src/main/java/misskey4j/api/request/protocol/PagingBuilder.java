package misskey4j.api.request.protocol;

public interface PagingBuilder<T> {

    T limit(Long limit);

    T sinceId(String sinceId);

    T untilId(String untilId);
}
