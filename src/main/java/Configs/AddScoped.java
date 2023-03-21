package Configs;

public class AddScoped<T, E>{
    private final Class<T> type;
    private final Class<E> obj;
    public AddScoped(Class<T> type, Class<E> obj) {
        this.type = type;
        this.obj = obj;
    }
    public Class<T> getMyType() {
        return this.type;
    }

    public Class<E> getMyObj() {
        return this.obj;
    }

    public E AddScoped(){
        try {
            return this.getMyObj().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
