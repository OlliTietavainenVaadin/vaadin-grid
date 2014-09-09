package com.vaadin.prototype.wc.gwt.client.components;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.core.client.js.JsArray;
import com.google.gwt.core.client.js.JsObject;
import com.google.gwt.dom.client.BodyElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.user.client.EventListener;
import com.vaadin.prototype.wc.gwt.client.html.*;

@JsType(prototype = "HTMLElement", isNative = true)
public interface CoreDropdown extends HTMLElement {

  Class<?>[] dependencies = new Class<?>[]{};

  /**
   * The element associated with this dropdown, usually the element that triggers
   * the menu.
   *
   * @attribute relatedTarget
   * @type Node
   */
  @JsProperty CoreDropdown relatedTarget(JsObject val);
  @JsProperty JsObject relatedTarget();

  /**
   * If true, the menu is currently visible.
   *
   * @attribute opened
   * @type boolean
   * @default false
   */
  @JsProperty CoreDropdown opened(boolean val);
  @JsProperty boolean opened();

  /**
   * The horizontal alignment of the popup relative to `relatedTarget`. `left`
   * means the left edges are aligned together. `right` means the right edges
   * are aligned together.
   *
   * @attribute halign
   * @type 'left' | 'right'
   * @default 'left'
   */
  @JsProperty CoreDropdown halign(JsObject val);
  @JsProperty JsObject halign();

  /**
   * The vertical alignment of the popup relative to `relatedTarget`. `top` means
   * the top edges are aligned together. `bottom` means the bottom edges are
   * aligned together.
   *
   * @attribute valign
   * @type 'top' | 'bottom'
   * @default 'top'
   */
  @JsProperty CoreDropdown valign(JsObject val);
  @JsProperty JsObject valign();

  /**
   * A pixel amount around the dropdown that will be reserved. It's useful for
   * ensuring that, for example, a shadow displayed outside the dropdown will
   * always be visible.
   *
   * @attribute margin
   * @type number
   * @default 0
   */
  @JsProperty CoreDropdown margin(double val);
  @JsProperty double margin();

  /**
   * The transition property specifies a string which identifies a 
   * <a href="../core-transition/">`core-transition`</a> element that 
   * will be used to help the overlay open and close. The default
   * `core-transition-fade` will cause the overlay to fade in and out.
   *
   * @attribute transition
   * @type string
   * @default null
   */
  @JsProperty CoreDropdown transition(String val);
  @JsProperty String transition();
}