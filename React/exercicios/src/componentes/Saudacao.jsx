import React, { Component, Fragment } from "react";

export default class Saudacao extends Component{

  /* Estado inicial definido */
  state = {
    tipo: this.props.tipo,
    idade: 32,
    nome: this.props.nome
  }

  /* Definição do novo estado a partir de evento de mudança (onChange) */
  setTipo(evento){
    this.setState({ tipo: evento.target.value})
  }

  setNome(evento){
    this.setState({ nome: evento.target.value})
  }

  render(){
    /* Não pego como parâmetro, mas como estado, seguindo a baixo
     const { tipo, nome } = this.props; */
    const { tipo, nome } = this.state;
    return (
      <Fragment>
        <h1>{tipo} {nome}!</h1>
        <hr />
        <input type="text" placeholder="Tipo..." value={tipo} 
          onChange={evento =>{ this.setTipo(evento)}}/>
        <input type="text" placeholder="Nome..." value={nome} 
          onChange={evento => this.setNome(evento)}/>
      </Fragment>
    )
  }
}