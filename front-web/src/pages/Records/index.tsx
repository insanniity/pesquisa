import {useEffect, useState} from "react";
import axios from "axios";
import {RecordsResponse} from "../../assets/types";
import {formatData} from "../../assets/helper";
import Pagination from "../../components/pagination";
import Filters from "../../components/filters";

const BASE_URL = 'https://insannity-pesquisa.herokuapp.com';

const Records = () => {
    const [recordsResponse, setRecordsResponse] = useState<RecordsResponse>();
    const [activePage, setActivePage] = useState(0);

    useEffect(() => {
        axios.get(`${BASE_URL}/records?linesPerPage=12&page=${activePage}`)
            .then(response => setRecordsResponse(response.data))
            .catch(() => console.log("Erro!"))
    }, [activePage]);

    const handlePageChange = (index:number) => {
        setActivePage(index);
    };

    return(
        <div className="page-container">
            <Filters link="/charts" linkText="Ver gráfico"/>
            <table className="records-table" cellPadding="0" cellSpacing="0">
                <thead>
                    <tr>
                        <th>Instante</th>
                        <th>Nome</th>
                        <th>Idade</th>
                        <th>Plataforma</th>
                        <th>Genero</th>
                        <th>Titulo do game</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        recordsResponse?.content.map(record => (
                            <tr key={record.id}>
                                <td>{formatData(record.moment)}</td>
                                <td>{record.name}</td>
                                <td>{record.age}</td>
                                <td className="text-secondary">{record.gamePlatform}</td>
                                <td>{record.genreName}</td>
                                <td className="text-primary">{record.gameTitle}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
            <Pagination activePage={activePage} totalPages={recordsResponse?.totalPages} goToPage={handlePageChange} />
        </div>
    )
}

export default Records;