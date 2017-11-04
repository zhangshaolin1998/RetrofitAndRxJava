package com.bewei.retrofitandrxjava.inter;

import com.bewei.retrofitandrxjava.bean.News;
import com.bewei.retrofitandrxjava.bean.User;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/11/3 10:13
 */


public interface ApiService {
    /**
     * 结合Retrofit+RxJava
     * thtp://service.meiyinkeqiu.com/service/ads/cptj
     * @param
     * @return
     */
    @GET("ads/cptj")
    Observable<News> getNoParams();
    /**
     * 结合RxJava
     * @param user
     * @return
     * https://api.github.com/users/forever
     */
    @GET("users/{user}")
  Observable<User>  getHasParams(@Path("user")String user);
}
