import React, { Component, Fragment } from "react";

export default class SaudacaoTeste extends Component{

  /* estado inicial */
  state = {
    tipo: this.props.tipo,
    nome: this.props.nome,
    idade: this.props.idade
  }
  
  /* definir novo estado a partir de EVENTO de mudança (onChange) */
  handleChange = (campo) => (evento) => {
    this.setState({[campo]: evento.target.value})
  }
  
  /* renderizar */
  render(){
    /* numa constante pego do estado e aponto com this */
    const { tipo, nome, idade } = this.state;
    /* retorno varios elementos passando input de alterações */
    return (
     <Fragment>
      <h1>{tipo} {nome}!</h1>
      <h2>{idade} de idade.</h2>
      <hr />
      <input type="text" placeholder="Tipo..." value={tipo} onChange={this.handleChange('tipo')} />
      <input type="text" placeholder="Nome..." value={nome} onChange={this.handleChange('nome')} />
      <input type="text" placeholder="idade..." value={idade} onChange={this.handleChange('idade')} />
     </Fragment> 
    )    
  }
}