import {BrowserRouter, Switch, Route} from "react-router-dom";
import Home from "./pages/Home";
import Header from "./components/header";
import Records from "./pages/Records";

const Routes = () =>{
    return(
        <>
            <Header />
            <BrowserRouter>
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
            </BrowserRouter>
        </>
    )
}

export default Routes;