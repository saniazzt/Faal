
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Faal {
    @JsonProperty("Poem")
    private String Poem;

    @JsonProperty("Interpretation")
    private String Interpretation;

    public String getPoem(){
        String in = Poem;
        in = in.replace("\\n", "\n");
        Poem = in.replace("\\r","\r");
        return this.Poem;
    }
    public String getInterpretation(){
        return this.Interpretation;
    }
}