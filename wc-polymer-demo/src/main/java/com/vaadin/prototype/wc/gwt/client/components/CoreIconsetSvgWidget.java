package com.vaadin.prototype.wc.gwt.client.components;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.prototype.wc.gwt.client.*;
import com.vaadin.prototype.wc.gwt.client.util.*;

public class CoreIconsetSvgWidget extends CoreMetaWidget  {

    protected String[] events() {
      return new String[]{};
    }

    public CoreIconsetSvgWidget() {
      super(WC.create(CoreIconsetSvg.class));
    }

    public CoreIconsetSvgWidget(CoreIconsetSvg element) {
      super(element);
    }

    protected CoreIconsetSvg element() {
      return (CoreIconsetSvg)super.getElement();
    }

    public void iconSize(double val) {
        element().iconSize(val);
    }
    public double iconSize() {
        return element().iconSize();
    }
    public void applyIcon(Element arg0, String arg1) {
         element().applyIcon(arg0, arg1);
    }
    public void updateIcons(JavaScriptObject arg0, JavaScriptObject arg1) {
         element().updateIcons(arg0, arg1);
    }

}
