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
  marginLeft: theme.spacing(1),
  width: 'auto',
  color: 'black',
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
    paddingLeft: `calc(1em + ${theme.spacing(4)})`,
    transition: theme.transitions.create('width'),
    [theme.breakpoints.up('sm')]: {
      width: '20ch', // Increase the initial width
      '&:focus': {
        width: '30ch', // Increase the width when focused
      },
    },
  },
}));

const StyledAppBar = styled(AppBar)({
  backgroundColor: 'white',
  color: '#e10600',
  height: '5em', // Set the desired height
});


const StyledTypography = styled(Typography)({
  fontFamily: 'Bebas Neue',
  fontSize: '1.5em',
  marginRight: '1em',
  cursor: 'pointer',
});

const TitleTypography = styled(Typography)({
  fontFamily: 'Bebas Neue',
  fontSize: '2em',
  marginRight: '1em',
  cursor: 'pointer',
});

const MenuTypography = styled(MenuItem)({
  fontFamily: 'Bebas Neue',
  color: '#e10600',
  fontSize: '1.5em',
});

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
      <StyledAppBar position="fixed">
        <Toolbar sx={{ height: '5em'}}>
          <TitleTypography onClick={() => navigate("/")}>
            F1 NOW
          </TitleTypography>
          <StyledTypography onClick={handleMenuOpen}>
            Standings
          </StyledTypography>
          <Menu
            anchorEl={anchorEl}
            open={Boolean(anchorEl)}
            onClose={handleMenuClose}
          >
            <MenuTypography onClick={() => handleMenuItemClick("/standings/driver")}>
              Drivers
            </MenuTypography>
            <MenuTypography onClick={() => handleMenuItemClick("/standings/constructor")}>
              Constructors
            </MenuTypography>
          </Menu>
          <StyledTypography onClick={() => navigate("/race")}>
            Races
          </StyledTypography>
          <StyledTypography onClick={() => navigate("/driver")}>
            Drivers
          </StyledTypography>
          <StyledTypography onClick={() => navigate("/constructor")}>
            Teams
          </StyledTypography>
          <Box sx={{ flexGrow: 1 }} />
          <Search>
            <SearchIconWrapper>
              <SearchIcon />
            </SearchIconWrapper>
            <StyledInputBase
              placeholder="Search"
              inputProps={{ 'aria-label': 'search' }}
            />
          </Search>
        </Toolbar>
      </StyledAppBar>
    </Box>
  );
}
