package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;

@Path("users")
@RequestScoped
public class ShowUsers {
	
	public ShowUsers (){
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getUsers(){
		List<String> userList = new ArrayList<>();
		userList.add("ユーザ2");
		userList.add("ユーザ3");
		userList.add("ユーザ4");
		userList.add("ユーザ5");
        return userList;
	}
	
	@POST
	@Path("detail")
	public Response showUserInfo(@FormParam("postUserId") String userId) {
		// レスポンス200を返す
		return Response.status(200)
				.entity(userId + "のユーザ情報です")
				.build();
	}
}
