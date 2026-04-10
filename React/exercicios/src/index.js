import React from 'react';
import ReactDOM from 'react-dom/client';

import Primeiro from './componentes/Primeiro';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <h1>Colé, mundo!</h1>
    <Primeiro />
  </React.StrictMode>
);

