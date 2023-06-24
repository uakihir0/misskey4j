package misskey4j.entity.contant;

/**
 * 認可スコープを表現するクラス
 */
public class Scope {

    private String operation;
    private String target;

    // すべてのスコープリスト
    public static final Scope[] ALL = {

            // Read Write
            Scope.read().account(),
            Scope.write().account(),
            Scope.read().blocks(),
            Scope.write().blocks(),
            Scope.read().drive(),
            Scope.write().drive(),
            Scope.read().favorites(),
            Scope.write().favorites(),
            Scope.read().following(),
            Scope.write().following(),
            Scope.read().messaging(),
            Scope.write().messaging(),

            Scope.read().mutes(),
            Scope.write().mutes(),
            Scope.read().notifications(),
            Scope.write().notifications(),
            Scope.read().reactions(),
            Scope.write().reactions(),
            Scope.read().pages(),
            Scope.write().pages(),
            Scope.read().pageLikes(),
            Scope.write().pageLikes(),
            Scope.read().userGroups(),
            Scope.write().userGroups(),

            // Channels
            Scope.read().channels(),
            Scope.write().channels(),

            // Write Only
            Scope.write().notes(),
            Scope.write().votes()
    };

    public Scope(String operation, String target) {
        this.operation = operation;
        this.target = target;
    }

    public String getOperation() {
        return operation;
    }

    public String getTarget() {
        return target;
    }

    public String code() {
        return toString();
    }

    @Override
    public String toString() {
        return operation + ":" + target;
    }

    public static ScopeOperation read() {
        return new ScopeOperation("read");
    }

    public static ScopeOperation write() {
        return new ScopeOperation("write");
    }

    /**
     * 認可オペレーションを表現するクラス
     */
    public static class ScopeOperation {

        private String operation;

        public ScopeOperation(String operation) {
            this.operation = operation;
        }

        public String getOperation() {
            return operation;
        }

        public Scope account() {
            return new Scope(operation, "account");
        }

        public Scope blocks() {
            return new Scope(operation, "blocks");
        }

        public Scope drive() {
            return new Scope(operation, "drive");
        }

        public Scope favorites() {
            return new Scope(operation, "favorites");
        }

        public Scope following() {
            return new Scope(operation, "following");
        }

        public Scope messaging() {
            return new Scope(operation, "messaging");
        }

        public Scope mutes() {
            return new Scope(operation, "mutes");
        }

        public Scope notes() {
            return new Scope(operation, "notes");
        }

        public Scope notifications() {
            return new Scope(operation, "notifications");
        }

        public Scope reactions() {
            return new Scope(operation, "reactions");
        }

        public Scope votes() {
            return new Scope(operation, "votes");
        }

        public Scope pages() {
            return new Scope(operation, "pages");
        }

        public Scope pageLikes() {
            return new Scope(operation, "page-likes");
        }

        public Scope userGroups() {
            return new Scope(operation, "user-groups");
        }

        public Scope channels() {
            return new Scope(operation, "channels");
        }
    }
}
