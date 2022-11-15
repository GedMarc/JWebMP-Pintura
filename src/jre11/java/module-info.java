import com.jwebmp.core.services.*;
import com.jwebmp.plugins.pintura.*;

module com.jwebmp.plugins.pintura {
	requires transitive com.jwebmp.core.base.angular.client;
	
	provides IPageConfigurator with PinturaPageConfigurator;
}
