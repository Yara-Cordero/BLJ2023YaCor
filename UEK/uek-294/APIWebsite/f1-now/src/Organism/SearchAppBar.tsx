import { styled, alpha, createTheme } from '@mui/material/styles';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import InputBase from '@mui/material/InputBase';
import SearchIcon from '@mui/icons-material/Search';
import { Typography, Menu, MenuItem } from '@mui/material';
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

const theme = createTheme({
  typography: {
    fontFamily: 'Bebas Neue, Arial',
  },
});

const Search = styled('div')(({ theme }) => ({
  position: 'relative',
  borderRadius: theme.shape.borderRadius,
  backgroundColor: alpha(theme.palette.common.white, 0.15),
  '&:hover': {
    backgroundColor: alpha(theme.palette.common.white, 0.25),
  },
  marginLeft: 0,
  width: '100%',
  [theme.breakpoints.up('sm')]: {
    marginLeft: theme.spacing(1),
    width: 'auto',
  },
}));

const SearchIconWrapper = styled('div')(({ theme }) => ({
  padding: theme.spacing(0, 2),
  height: '100%',
  position: 'absolute',
  pointerEvents: 'none',
  display: 'flex',
  alignItems: 'center',
  justifyContent: 'center',
}));

const StyledInputBase = styled(InputBase)(({ theme }) => ({
  color: 'inherit',
  width: '100%',
  '& .MuiInputBase-input': {
    padding: theme.spacing(1, 1, 1, 0),
    // vertical padding + font size from searchIcon
    paddingLeft: `calc(1em + ${theme.spacing(4)})`,
    transition: theme.transitions.create('width'),
    [theme.breakpoints.up('sm')]: {
      width: '12ch',
      '&:focus': {
        width: '20ch',
      },
    },
  },
}));

export default function SearchAppBar() {
  const navigate = useNavigate();
  const [anchorEl, setAnchorEl] = useState(null);

  const handleMenuOpen = (event) => {
    setAnchorEl(event.currentTarget);
  };

  const handleMenuClose = () => {
    setAnchorEl(null);
  };

  const handleMenuItemClick = (route) => {
    navigate(route);
    handleMenuClose();
  };

  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar position="fixed" sx={{ backgroundColor: 'white', color: '#e10600' }}>
        <Toolbar>
          <Typography
            sx={{ fontFamily: 'Bebas Neue', fontSize: '40px', marginRight: '20px', cursor: 'pointer' }}
            onClick={() => navigate("/")}
          >
            F1 NOW
          </Typography>
          <Typography
            sx={{ fontFamily: 'Bebas Neue', fontSize: '20px', marginRight: '20px', cursor: 'pointer' }}
            onClick={handleMenuOpen}
          >
            Standings
          </Typography>
          <Menu
            anchorEl={anchorEl}
            open={Boolean(anchorEl)}
            onClose={handleMenuClose}
          >
            <MenuItem
              onClick={() => handleMenuItemClick("/standings/driver")}
              sx={{ fontFamily: 'Bebas Neue', color: '#e10600' }}
            >
              Drivers
            </MenuItem>
            <MenuItem
              onClick={() => handleMenuItemClick("/standings/constructor")}
              sx={{ fontFamily: 'Bebas Neue', color: '#e10600' }}
            >
              Constructors
            </MenuItem>
          </Menu>
          <Typography
          sx={{ fontFamily: 'Bebas Neue', fontSize: '20px', marginRight: '20px', cursor: 'pointer' }}
          onClick={() => navigate("/race")}
          >
            Races
          </Typography>
          <Typography
          sx={{ fontFamily: 'Bebas Neue', fontSize: '20px', marginRight: '20px', cursor: 'pointer' }}
          onClick={() => navigate("/race")}
          >
            Drivers
          </Typography>
          <Typography
          sx={{ fontFamily: 'Bebas Neue', fontSize: '20px', marginRight: '50px', cursor: 'pointer' }}
          onClick={() => navigate("/constructor")}
          >
            Teams
          </Typography>
          <Search sx={{ color: 'black'}}>
            <SearchIconWrapper>
              <SearchIcon />
            </SearchIconWrapper>
            <StyledInputBase
              placeholder="Search"
              inputProps={{ 'aria-label': 'search' }}
            />
          </Search>
        </Toolbar>
      </AppBar>
    </Box>
  );
}
