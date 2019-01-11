package net.searock.stethoexample.remote;

import net.searock.stethoexample.domain.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET("users/{user}")
    Call<User> listRepos(@Path("user") String user);
}
