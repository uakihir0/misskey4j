package misskey4j;

import misskey4j.entity.join.Instance;
import misskey4j.entity.collection.Instances;
import misskey4j.search.SearchInstances;
import org.junit.Test;

public class InstancesTest {

    @Test
    public void testGetInstances() {
        SearchInstances search = MisskeyFactory.getSearchInstances();
        Instances instances = search.getMisskeyInstanceList();


        for (Instance instance : instances.getInstances()) {
            System.out.println("======================================");
            System.out.println("URL    > " + instance.getUrl());
            System.out.println("DESC   > " + instance.getDescription());

            if (instance.getMeta() != null) {
                System.out.println("S BANNER > " + instance.getMeta().getBannerUrl());
                System.out.println("O BANNER > " + instance.getMeta().getOriginalBannerUrl());
            }
            if (instance.getStats() != null) {
                System.out.println("USERS  > " + instance.getStats().getOriginalUsersCount());
            }

        }
    }
}
