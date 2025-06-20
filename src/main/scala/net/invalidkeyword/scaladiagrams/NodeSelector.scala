package net.invalidkeyword.scaladiagrams

class NodeSelector(nodes : List[TYPE]) {

  def findNode(name : String) = nodes.find(_.name == name).asInstanceOf[Option[TYPE]]
  def findNode(w : RELATED) = nodes.find(_.name == w.name).asInstanceOf[Option[TYPE]]
 
  def selectChildNodes (parent : TYPE) : Set[TYPE]= {
    selectChildNodesHelper(parent, Set())
  }

  private def selectChildNodesHelper(parent: TYPE, visited: Set[TYPE]): Set[TYPE] = {
    if(visited.contains(parent)) return Set()

    val childset = parent.children.map(a => findNode(a.name)).flatten.toSet
    childset.map(selectChildNodesHelper(_, visited + parent)).flatten + parent
  }
  
  def nodesWithParentsOrChildren = {
    nodes.filter(n => n.hasChildren || nodes.filter(b => b.asInstanceOf[TYPE].isParentOf(n.name)).size > 0).toSet
  }
}