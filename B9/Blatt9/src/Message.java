public abstract class Message<T> {
    protected int id;
    protected T Content;
    protected User sender;
    protected User receiver;
}
