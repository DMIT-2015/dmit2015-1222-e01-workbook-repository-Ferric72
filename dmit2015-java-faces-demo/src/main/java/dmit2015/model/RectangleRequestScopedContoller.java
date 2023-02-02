package dmit2015.model;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("currentRectangleRequestScopedContollerRequestScopedController")
@RequestScoped  // create this object for one HTTP request and destroy after the HTTP response has been sent
public class RectangleRequestScopedContoller {


}