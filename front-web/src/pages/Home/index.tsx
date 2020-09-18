import React from 'react';
import { ReactComponent as ArrowIcon } from '../../assets/arrow.svg';
import { ReactComponent as GamerImage } from '../../assets/gamer.svg';
import './styles.css';

const Home = () => (
    <div className="home-container">
        <div className="home-text">
            <h1 className="home-text-title">
                What are the games people love to play?
            </h1>
            <h3 className="home-text-subtitle">
                Click on the button below and find out which games are being chosen!
            </h3>
            <div className="home-actions">
                <button className="home-btn">
                    I WANT TO KNOW!
                    </button>
                <div className="home-btn-icon">
                    <ArrowIcon />
                </div>
            </div>
        </div>
        <GamerImage className="home-image" />
    </div>
);

export default Home;