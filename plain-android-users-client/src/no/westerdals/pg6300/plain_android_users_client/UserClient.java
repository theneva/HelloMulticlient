package no.westerdals.pg6300.plain_android_users_client;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.util.List;

@Rest(rootUrl = "http://10.0.3.2:9876/api/users", converters = {GsonHttpMessageConverter.class})
public interface UserClient
{
    @Get("/")
    List<User> query();

    @Post("/")
    User post(User user);
}
