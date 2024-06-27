import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

interface AsyncCallback<T> {
    void onComplete(T value, Optional<Exception> ex);
}

interface AsyncResult<T> {
    boolean isCompleted();

    T getValue() throws ExecutionException;

    void await() throws InterruptedException;
}

interface AsyncExecutor {
    <T> AsyncResult<T> startProcess(Callable<T> task);

    <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback);

    <T> T endProcess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException;
}
