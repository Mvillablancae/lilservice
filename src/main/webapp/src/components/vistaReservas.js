import React from 'react';

import { Button, Card, Table } from 'react-bootstrap';
import { Link } from 'react-router-dom';


class VistaReservas extends React.Component {
    render() {
        return (
            <Card style={{ width: "65rem" }}>
                <Card.Body>
                    <Button>Solicitud </Button>
                    <Table striped bordered hover variant="dark">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td colSpan="2">Larry the Bird</td>
                                <td>@twitter</td>
                            </tr>
                        </tbody>
                    </Table>
                    <Link className="Button success" to={"addSolicitud"}>Solicitud</Link>
                </Card.Body>
            </Card>
        );
    }
}

export default VistaReservas;