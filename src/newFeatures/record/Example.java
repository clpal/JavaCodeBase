package newFeatures.record;

import java.time.LocalDateTime;

public class Example {
    public static void main(String[] args) {
        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                404,
                "Not Found",
                "/api/resource"
        );

        System.out.println(errorResponse);
    }
}