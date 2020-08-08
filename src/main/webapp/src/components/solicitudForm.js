import React, { useState } from 'react';
import { Form, Card, Button } from 'react-bootstrap';
import Select from 'react-select';
import makeAnimated from 'react-select/animated';
import { Link } from 'react-router-dom';

const medico_options = [
    { value: '1', label: 'Jorge Gonzalez' },
    { value: '2', label: 'Maria Pérez' },
    { value: '3', label: 'Tulio Triviño' },
    { value: '4', label: 'Martin Carcamo' },
    { label: 'Karol Dance', value: '5' },
    { label: 'Michael Jackson', value: '6' },
];

const equipamiento_options = [
    { label: 'Bisturi', value: '1' },
    { label: 'Pinza', value: '2' },
    { label: 'Camilla', value: '3' },
    { label: 'Silla de ruedas', value: '4' },
    { label: 'Foco de Luz', value: '5' },
    { label: 'Mantita', value: '65' },
    { label: 'Bisturi', value: '154' },
    { label: 'Pinza', value: '7234' },
    { label: 'Camilla', value: '2123' },
    { label: 'Silla de ruedas', value: '8123' },
    { label: 'Foco de Luz', value: '343' },
    { label: 'Mantita', value: '235' },
    { label: 'Bisturi', value: '112' },
    { label: 'Pinza', value: '7123' },
    { label: 'Camilla', value: '2123' },
    { label: 'Silla de ruedas', value: '128' },
    { label: 'Foco de Luz', value: '3123' },
    { label: 'Mantita', value: '1235' },
];

const procedimiento_options = [
    { label: 'Quimioterapia', value: '1' },
    { label: 'Cirujía', value: '7' },
    { label: 'Recuperación', value: '1232' },
];

const espacios_options = [
    { label: 'Sala 12B', value: '1' },
    { label: 'Sala 13B', value: '7' },
    { label: 'Sala 15c', value: '2' },
    { label: 'Pabellón 12B', value: '12' },
    { label: 'Pabellón 5A', value: '73' },
    { label: 'Pabellón 11A', value: '14' },
    { label: 'Pabellón 11B', value: '712' },
    { label: 'Sillón 1A', value: '122' },
    { label: 'Sillón 13B', value: '1222' },
];


const SolicitudForm = () => {
    const [medico, setMedico] = useState([]);
    const [equipamiento, setEquipamiento] = useState([]);
    const [espacio, setEspacio] = useState({});
    const [procedimiento, setProcedimiento] = useState({});
    return (
        <Card style={{ width: "65rem" }}>
            <Card.Body>
                <h1>Añadir Solicitud</h1>
                <Form className="pt-4">
                    <Form.Group controlId="exampleForm.ControlInput1">
                        <Form.Label>Paciente</Form.Label>
                        <Form.Control type="email" placeholder="Juan Gómez" />
                    </Form.Group>
                    <Form.Group className="pt-4" controlId="exampleForm.ControlSelect1">
                        <Form.Label style={{ textAlign: "left" }}>Procedimiento</Form.Label>
                        <Select
                            options={procedimiento_options} placeholder="Seleccione el procedimiento" onChange={setProcedimiento} className="mb-3" isSearchable>

                        </Select>
                    </Form.Group>
                    <Form.Group className="pt-4" controlId="exampleForm.ControlSelect1">
                        <Form.Label style={{ textAlign: "left" }}>Equipo de trabajo</Form.Label>
                        <Select
                            options={medico_options} className="mb-3" placeholder="Seleccione a los miembros del equipo" onChange={setMedico} isMulti isSearchable>

                        </Select>
                    </Form.Group>
                    <Form.Group className="pt-4" controlId="exampleForm.ControlSelect2">
                        <Form.Label style={{ textAlign: "left" }}>Espacio de trabajo</Form.Label>
                        <Select
                            options={espacios_options} className="mb-3" placeholder="Seleccione el espacio de trabajo" onChange={setEspacio} isSearchable>

                        </Select>
                    </Form.Group>
                    <Form.Group className="pt-4" controlId="exampleForm.ControlSelect3">
                        <Form.Label style={{ textAlign: "left" }}>Herramientas de trabajo</Form.Label>
                        <Select
                            options={equipamiento_options} placeholder="Seleccione las herramientas necesarias" onChange={setEquipamiento} className="mb-3" isMulti isSearchable>

                        </Select>
                    </Form.Group>
                    <Link className="Button success" to={""}>Generar Solicitud</Link>
                    
                </Form>
            </Card.Body>
        </Card>
    );
}


export default SolicitudForm;