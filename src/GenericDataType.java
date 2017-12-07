public class GenericDataType<T> {
    private T account;
    public GenericDataType(T account)
    {
        this.account=account;
    }
    public T getAccount()
    {
        return this.account;
    }
    public void setAccount(T t1)
    {
        this.account = t1;
    }
}