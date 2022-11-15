/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.pintura;

import com.jwebmp.core.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.core.services.*;
import jakarta.validation.constraints.*;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "Pintura",
        pluginDescription = "A powerful JavaScript Image Editor that integrates with every stack\n" +
                            "A fully configurable image editor SDK that's intuitive on mobile and desktop. Set image requirements and help your customers upload better pictures.",
        pluginUniqueName = "jwebmp-pintura",
        pluginVersion = "5.1.0",
        pluginCategories = "componenttemplate,ui,web ui, framework",
        pluginSubtitle = "ComponentTemplate makes sidebar development faster and easier.",
        pluginSourceUrl = "https://github.com/Grsmto/componenttemplate",
        pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Pintura/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebMP-Pintura",
        pluginIconUrl = "bower_components/componenttemplate/componenttemplateicon.jpg",
        pluginIconImageUrl = "bower_components/componenttemplate/componenttemplatelogo.jpg",
        pluginOriginalHomepage = "https://pqina.nl/pintura/",
        pluginDownloadUrl = "https://github.com/GedMarc/JWebMP-Pintura")


public class PinturaPageConfigurator
        implements IPageConfigurator<PinturaPageConfigurator> {
    /**
     * If this configurator is enabled
     */
    private static boolean enabled = true;

    /**
     * The default page configurator for componenttemplate
     */
    public PinturaPageConfigurator() {
        //Nothing Needed
    }

    /**
     * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
     */
    public static boolean isEnabled() {
        return PinturaPageConfigurator.enabled;
    }

    /**
     * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
     */
    public static void setEnabled(boolean mustEnable) {
        PinturaPageConfigurator.enabled = mustEnable;
    }


    /**
     * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
     * <p>
     * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page
     * via file://
     *
     * @return
     */
    @NotNull
    @Override
    public Page<?> configure(Page<?> page) {
        if (!page.isConfigured() && enabled()) {
       
        }
        return page;
    }

    @Override
    public boolean enabled() {
        return PinturaPageConfigurator.enabled;
    }

}
