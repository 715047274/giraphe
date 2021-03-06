package com.creactiviti.giraphe.graph;

import java.util.Iterator;

/**
 * @author Arik Cohen
 * @since Dec 16, 2017
 */
public interface Traversal<E extends Element> extends Iterator<E>, Iterable<E> {
  
  Traversal<E> hasId (String aId);
  
  Traversal<E> has (String aProperty, Object aValue);
  
  Traversal<E> type (String aType);
  
  Traversal<E> from (String aEdgeType, String aToNodeId);
  
  Traversal<E> to (String aEdgeType, String aFromNodeId);
  
}
