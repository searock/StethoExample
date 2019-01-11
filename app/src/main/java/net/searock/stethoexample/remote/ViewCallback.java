package net.searock.stethoexample.remote;

public interface ViewCallback<T, E> {

    void onSuccess(T domain);
    void onError(E exception);
}
