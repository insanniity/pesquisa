import {BrowserRouter, Switch, Route} from "react-router-dom";
import Home from "./pages/Home";
import Header from "./components/header";
import Records from "./pages/Records";
import Charts from "./pages/Charts";

const Routes = () =>{
    return(
        <>
            <BrowserRouter>
                <Header />
                <Switch>
                    <Route path="/" exact>
                        <Home />
                    </Route>
                </Switch>
                <Switch>
                    <Route path="/records" >
                        <Records />
                    </Route>
                </Switch>
                <Switch>
                    <Route path="/charts" >
                        <Charts />
                    </Route>
                </Switch>
            </BrowserRouter>
        </>
    )
}

export default Routes;