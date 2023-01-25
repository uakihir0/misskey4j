package misskey4j;

import misskey4j.entity.search.JoinInstance;
import misskey4j.search.SearchInstances;
import org.junit.Test;

public class InstancesTest {

    @Test
    public void testGetInstances() {
        SearchInstances search = MisskeyFactory.getSearchInstances();
        JoinInstance.Instances instances = search.getMisskeyInstanceList();


        for (JoinInstance joinInstance : instances.getInstances()) {
            System.out.println("======================================");
            System.out.println("URL    > " + joinInstance.getUrl());
            System.out.println("DESC   > " + joinInstance.getDescription());

            if (joinInstance.getMeta() != null) {
                System.out.println("S BANNER > " + joinInstance.getMeta().getBannerUrl());
                System.out.println("O BANNER > " + joinInstance.getMeta().getOriginalBannerUrl());
            }
            if (joinInstance.getStats() != null) {
                System.out.println("USERS  > " + joinInstance.getStats().getOriginalUsersCount());
            }

        }
    }
}
