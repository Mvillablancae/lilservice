import React from 'react';

import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';

import './App.css';
import SolicitudForm from './components/solicitudForm';
import VistaReservas from './components/vistaReservas';


function App() {
  return (
    <Router>
      <Switch>  
        <Route path="/" exact component={ VistaReservas }/>
        <Route path="/addSolicitud" exact component={ SolicitudForm }/>
      </Switch>
    </Router>
  );
}

export default App;
