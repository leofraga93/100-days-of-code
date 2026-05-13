import './Nav.css'
import React from "react";
import NavItem from "./NavItem"

export default props => (
  <aside className="menu-area">
    <nav className="menu">
      {/* Criar componentes nav-item 
      <a href="#/">
        <i className="fa fa-home"></i> Início
      </a>
      <a href="#/users">
        <i className="fa fa-users"></i> Usuários
      </a>
      */}
      
      <NavItem 
        href="/"
        icone="home"
        title="Início"/>

      <NavItem 
        href="/users"
        icone="users"
        title="Usuários" />
    </nav>

  </aside>
)