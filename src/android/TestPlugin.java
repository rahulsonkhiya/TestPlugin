package Testid;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class TestPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("Greeting")) {
            String message = args.getString(0);
            this.Greeting(message, callbackContext);
            return true;
        }
        return false;
    }

    private void Greeting(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success("Thanks "+message+".You're welcome.");
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
	
}
