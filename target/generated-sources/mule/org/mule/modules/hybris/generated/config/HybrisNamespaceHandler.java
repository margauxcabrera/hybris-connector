
package org.mule.modules.hybris.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.hybris.config.AuthorizeDefinitionParser;
import org.mule.modules.hybris.config.UnauthorizeDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/hybris</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-07-31T02:51:08+10:00", comments = "Build UNNAMED.2793.f49b6c7")
public class HybrisNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(HybrisNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [hybris] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [hybris] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config-with-oauth", new HybrisConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config-with-oauth", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("authorize", new AuthorizeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("authorize", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("unauthorize", new UnauthorizeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("unauthorize", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("greet", new GreetDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("greet", "@Processor", ex);
        }
    }

}
