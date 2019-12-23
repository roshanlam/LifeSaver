package ai.api;
import java.util.List;

public interface PartialResultsListener {
void onPartialResults(final List<String> partialResults);
}
