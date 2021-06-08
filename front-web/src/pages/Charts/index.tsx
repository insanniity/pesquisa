import Filters from "../../components/filters";
import Chart from "react-apexcharts";
import {barOptions, pieOptions} from "../../assets/chart-options";
import {useEffect, useState} from "react";
import axios from "axios";
import {buildBarSeries, getGenderChartData, getPlatformChartData} from "../../assets/helper";

const BASE_URL = 'https://insannity-pesquisa.herokuapp.com';

type PieChartData ={
    labels: string[];
    series: number[];
}

type BarChartData ={
    x: string;
    y: number;
}

const initialPieData = {
    labels: [],
    series: [],
}

const Charts = () => {

    const [barChartData, setBarChartData] = useState<BarChartData[]>([]);
    const [platFormData, setPlatformData] = useState<PieChartData>(initialPieData);
    const [genderData, setGenderData] = useState<PieChartData>(initialPieData);

    useEffect(() =>{
        async function getData(){
            const recordsResponse = await axios.get(`${BASE_URL}/records`);
            const gamesResponse = await axios.get(`${BASE_URL}/games`);
            const barData = buildBarSeries(gamesResponse.data, recordsResponse.data.content);
            setBarChartData(barData);

            const  platformData = getPlatformChartData(recordsResponse.data.content);
            setPlatformData(platformData);

            const genderData = getGenderChartData(recordsResponse.data.content);
            setGenderData(genderData);
        };
        getData();
    }, []);

    return(
        <div className="page-container">
            <Filters link="/records" linkText="Ver tabela" />
            <div className="chart-container">
                <div className="top-related">
                    <h1 className="top-related-title">Jogos mais votados</h1>
                    <div className="games-container">
                        <Chart options={barOptions} type="bar" width="900" height="650" series={[{data: barChartData}]}/>
                    </div>
                </div>
                <div className="charts">
                    <div className="platform-chart">
                        <h2 className="chart-title">Plataformas</h2>
                        <Chart options={{...pieOptions, labels: platFormData?.labels}} type="donut" series={platFormData?.series} width="350" />
                    </div>
                    <div className="gender-chart">
                        <h2 className="chart-title">Generos</h2>
                        <Chart options={{...pieOptions, labels: genderData?.labels}} type="donut" series={genderData?.series} width="350" />
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Charts;