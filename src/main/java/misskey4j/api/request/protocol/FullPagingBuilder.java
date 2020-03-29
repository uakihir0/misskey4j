package misskey4j.api.request.protocol;

public interface FullPagingBuilder<T> extends PagingBuilder<T> {

    T sinceDate(Long sinceDate);

    T untilDate(Long untilDate);
}
