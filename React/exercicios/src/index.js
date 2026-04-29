import React, { Fragment } from 'react';
import ReactDOM from 'react-dom/client';

import Primeiro from './componentes/Primeiro';
import Interagir from './componentes/Interagir';
import InteragirTeste from './componentes/InteragirTeste';

import { BoaTarde, BoaNoite } from './componentes/MultiComponentes';
import Saudacao from './componentes/Saudacao';
import SaudacaoTeste from "./componentes/SaudacaoTeste";

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <h1>Colé, mundo!</h1>
    <Primeiro />
    <Interagir nome="Leonardo" idade={32} />
    <InteragirTeste name="Leo" />

    <Fragment>
      <BoaTarde />
      <BoaNoite />
    </Fragment>

    <Saudacao tipo="Colé" nome="Leo" />
    <SaudacaoTeste tipo="Fala" nome="Leonardo" />
  </React.StrictMode>
);

