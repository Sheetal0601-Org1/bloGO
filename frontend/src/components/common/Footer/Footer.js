import React from 'react';
import styles from './Footer.';
import classNames from 'classnames/bind';

const cx = classNames.bind(styles);

const Footer = () => (
  <footer className={cx('footer')}>
    <div className={cx('content')}>© 2018 Copyright - backend Sheetal Lalwani - sopringboot crio</div>
  </footer>
);

export default Footer;