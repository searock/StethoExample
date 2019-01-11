package net.searock.stethoexample.remote;

import net.searock.stethoexample.domain.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class GitHubServiceImpl {

    private final String mUrl = "https://api.github.com/";

    public void getUserByLoginName(String loginName, final ViewCallback<User, Exception> viewCallback){

        Retrofit retrofit = new RetrofitHelper().getRetrofit(mUrl);

        GitHubService gitHubService = retrofit.create(GitHubService.class);

        gitHubService.listRepos(loginName).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                if(response.isSuccessful() && response.body() != null)
                    viewCallback.onSuccess(response.body());
                else
                    viewCallback.onError(new Exception("Error"));
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                viewCallback.onError(new Exception("Error"));
            }
        });
    }
}
