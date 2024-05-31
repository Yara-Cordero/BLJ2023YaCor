import { AppBar, Button, Toolbar, Typography } from '@mui/material'
import React from 'react'

function NavBar() {
  return (
    <AppBar position='fixed' className='navbar' sx={{color: "#e10600", fontFamily: "Babas " }}>
      <Toolbar>
          <Typography>hello</Typography>
      </Toolbar>
    </AppBar>
  )
}

export default NavBar