
package org.mule.modules.hybris.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.hybris.HybrisConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>HybrisConnectorProcessAdapter</code> is a wrapper around {@link HybrisConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-07-31T02:51:08+10:00", comments = "Build UNNAMED.2793.f49b6c7")
public abstract class HybrisConnectorProcessAdapter
    extends HybrisConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<HybrisConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, HybrisConnectorCapabilitiesAdapter> getProcessTemplate() {
        final HybrisConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,HybrisConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, HybrisConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, HybrisConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
