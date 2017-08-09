import com.wurmonline.server.behaviours.ActionEntry;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;

public class RaiseDirtAction implements ModAction, BehaviourProvider, ActionPerformer {

    private final ActionEntry actionEntry;
    private final short actionId;

    RaiseDirtAction(short actionId, ActionEntry actionEntry) {
        this.actionId = actionId;
        this.actionEntry = actionEntry;
    }

    @Override
    public short getActionId() {
        return actionId;
    }
}
