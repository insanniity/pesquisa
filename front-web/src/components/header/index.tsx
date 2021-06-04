import {ReactComponent as Logo} from "../../assets/imagens/logo.svg";


const Header = () => {
    return (
        <nav className="navbar navbar-dark bg-dark">
            <div className="container-fluid text-sm-center">
                <a className="navbar-brand" href="/">
                    <Logo />
                    <span className="logo-text-1"> Game</span>
                    <span className="logo-text-2"> Survey</span>
                </a>
            </div>
        </nav>
    )
}

export default Header;
