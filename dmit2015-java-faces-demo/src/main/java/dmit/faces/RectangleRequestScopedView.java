package dmit.faces;

import dmit2015.model.Rectangle;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Messages;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.annotation.PostConstruct;

@Named("currentRectangleRequestScopedView")
@RequestScoped  // create this object for one HTTP request and destroy after the HTTP response has been sent
public class RectangleRequestScopedView {

    // Delcare read/write properties (field + getter + setter) for each form field
    @Getter @Setter
    private Rectangle currentRectangle;

    // Declare read only properties (field + getter) for data sources

    // Declare private fields for internal usage only objects

    @PostConstruct // This method is executed after DI is completed (fields with @Inject now have values)
    public void init() { // Use this method to initialized fields instead of a constructor
        // Code to access fields annotated with @Inject
        currentRectangle = new Rectangle();
    }

    public void showArea() {
        Messages.addGlobalInfo("The area of this rectangle is {0}", currentRectangle.area());
    }

    public void showDiagonal() {
        Messages.addGlobalInfo("The diagonal of this rectangle is {0}", currentRectangle.diagonal());
    }

    public void showPerimeter() {
        Messages.addGlobalInfo("The area of this rectangle is {0}", currentRectangle.perimeter());
    }

    public void onClear() {
        // Set all fields to default values
    }

}